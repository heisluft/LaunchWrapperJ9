# LaunchWrapper J9
A small, inactive fork of LegacyLauncher (aka LaunchWrapper)

## Why
To test out how legacy mc behaves in J9+ conditions and ease
migration to ModLauncher

## Features
- Updated dependencies (No Log4Shell)
- Fixed and generalized the ClassLoader hackery via Unsafe
(code can be executed from J1.6 to 17 now)
- Java 1.5 bytecode (although niche, J1.5 is the bytecode 
for many old vanilla versions)
- Argument defaults (say goodbye to a null minecraftHome and
assetsDir)
- Fancy logging with more modern Log style and JUL redirection
(consistent logging with JANSI Highlighting and a configurable
log dir!)

## Notice
I'm in no way affiliated with MinecraftForge or Mojang.
LegacyLauncher has multiple design issues and I explicitly
**_don't_** condone using it. I do not support this fork.
The long term goal for me is to adapt McModLauncher to my
other code for old minecraft versions for which forge did
not yet exist (talking classic, indev and infdev)