### LanAPI
This repository contains my personal API that i use when creating Tribot scripts. Many people have since found it and i get questions about it daily. So here i will try to explain some of the features.

##### Core
The core namespace contains various java logic and objects, it can be used completely independant of Tribot.
* Pair & Triplets
* Bag object, a completely generic dynamic storage object
* JavaFX gui controllers
* Zip & unzip functions
* complete JSON library
* Strategy framework (similar to Node framework)
* Multifunctional and easy to use Logging with support for multiple outputs
* Fast generic math functions
* System traybar notification & icon logic
* String utilities

##### Game
The game namespace contains most tribot related extensions/helpers
* Easy Antiban (ABC2) wrapper
* Inventory observers
* Ingame Friends functions
* POH functions
* Easy premade Paint with a PaintBuilder
* Singleton Vars class (Bag object)
* LANScript - A Script wrapper that removes a lot of repetitive code, forces you into the Strategy(Node) Pattern, handles the GUI, Desktop notifications, Skill XP tracking, Profit tracking, Paint and adds general quality of life stuff.
* Helper classes for various tribot classes:
    * BankingHelper
    * ChooseOptionHelper
    * InterfacesHelper
    * ItemsHelper
    * NPCsHelper
    * ObjectsHelper
    * PlayersHelper
    * ProjectionHelper
    * SkillsHelper
    * TradingHelper

* Adds additional methods to existing Tribot classes:
    * Equipment
    * GroundItems
    * Inventory
    * Combat
    
* Adds additional filters to existing Tribot filters:
    * Items
    * GroundItems
    * NPCs
    * Projectiles (completely new)
    
##### Network
* Internet class to easily open the default browser of the user and navigate to a website.
* Retrieve item prices from rsbuddy's api (prices are cached once retrieved)
* Easy InputStream creator
* Download files to a local folder and read remote texts files and return as a string.
* Dynamic signature class that is compatible with my Scripters' Stats and Signature Centre (TBA)

If you have any questions, feel free to get in touch with me. You can often find me on the Tribot Discord chat, Skype or you can send me a message here or on the Tribot forums.
