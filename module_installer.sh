#!/sbin/sh

#################
# Initialization
#################

umask 022

# echo before loading util_functions
ui_print() { echo "$1"; }


#########################
# Load util_functions.sh
#########################

OUTFD=$2
ZIPFILE=$3

mount /data 2>/dev/null

. /data/adb/magisk/util_functions.sh

if [ "$(grep_get_prop ro.product.model)" != "TAB-A03-BR3" ]; then
  ui_print "**************************************"
  ui_print " この端末はチャレンジパッド３ではありません！ "
  ui_print "**************************************"
  exit 1
fi

if [ $(grep_get_prop ro.build.date.utc) -gt 1595234550 ]; then
  ui_print "************************************"
  ui_print " ビルドが 01.06.000 以下ではありません！ "
  ui_print "************************************"
  exit 1
fi

if [ $MAGISK_VER_CODE -ne 23000 ]; then
  ui_print "*************************************"
  ui_print " Magisk v23.0をインストールしてください！ "
  ui_print "*************************************"
  exit 1
fi

magiskhide enable
install_module
exit 0
