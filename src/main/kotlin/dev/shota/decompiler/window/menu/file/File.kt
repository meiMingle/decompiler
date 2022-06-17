package dev.shota.decompiler.window.menu.file

import dev.shota.decompiler.window.menu.file.items.*
import dev.shota.decompiler.window.utils.translate
import java.awt.event.KeyEvent
import javax.swing.JMenu
import javax.swing.JSeparator

class File : JMenu(translate("file")) {

    init {
        mnemonic = KeyEvent.VK_F
        add(OpenFile())
        add(OpenProcess())
        add(CloseTab())
        add(JSeparator())
        add(NewWindow())
        add(Exit())
    }

}