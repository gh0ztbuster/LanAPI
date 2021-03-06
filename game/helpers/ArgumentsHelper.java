package scripts.lanapi.game.helpers;

import scripts.lanapi.core.logging.LogProxy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Laniax
 */
public class ArgumentsHelper {

    static LogProxy log = new LogProxy("ArgumentsHelper");

    /**
     * Converts the raw hashmap received in #passArguments to a hashmap with useful key/values
     * Arguments are parsed in the following format: "setting1: value1; setting2: value2;"
     * @param input
     * @return
     */
    public static HashMap<String, String> get(HashMap<String, String> input) {

        String scriptSelect = input.get("custom_input");

        return getFromString(scriptSelect);
    }

    public static HashMap<String, String> getFromString(String str) {

        HashMap<String, String> args = new HashMap<>();

        if (str != null) {
            // Trim whitespace
            str = str.replaceAll("\\s","");

            // Split everything by ;
            List<String> argList = Arrays.asList(str.split(";"));

            for(String arg : argList) {

                if (!arg.contains(":")) {
                    log.error("Found invalid argument '%s', skipping.", arg);
                    continue;
                }

                String[] tmp = arg.split(":");
                args.put(tmp[0], tmp[1]);
            }

            for (Map.Entry<String, String> entry : args.entrySet()) {
                log.info("Found argument '%s' with value '%s'", entry.getKey(), entry.getValue());
            }
        }

        return args;
    }
}
