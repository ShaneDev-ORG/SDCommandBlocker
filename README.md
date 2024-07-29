# SDCommandBlocker
PLUGIN INFO & CONFIG

**SDCommandBlocker**
*Block commands with ease!*

**Dependency**
> NONE

**Permissions:**
> sdcb.blocker.bypass

**Config**
```yaml
# ==================================================
# Plugin: SDCommandBlocker
# Author: ShaneDev
# Version: 1.0
# Support Discord: https://discord.gg/Z6eF4QP4gD
# ==================================================


#Prefix of the plugin in chat.
Prefix: "&f&lBLOCKED &8&l» "


#List below all of the commands you would like to block.
#NOTE: This will block even if the command contains part of the blocked command.
#NOTE: such as "/pl" and "/plugins"; "/plugin" would be blocked because it contains the blocked command.
BlockedCommandsMessage: '&cThis command is blocked!'
Blocked-Commands:
  - "/BlockedCommand1"
  - "/BlockedCommand2"
```
