package dev.shota.decompiler.window.menu.edit

import dev.shota.decompiler.window.menu.edit.items.Copy
import dev.shota.decompiler.window.menu.edit.items.Find
import dev.shota.decompiler.window.menu.edit.items.SelectAll
import dev.shota.decompiler.window.utils.translate
import java.awt.event.KeyEvent
import javax.swing.JMenu

class Edit : JMenu(translate("edit")) {

    init {
        mnemonic = KeyEvent.VK_E
        add(Copy())
        add(SelectAll())
        add(Find())
    }

}