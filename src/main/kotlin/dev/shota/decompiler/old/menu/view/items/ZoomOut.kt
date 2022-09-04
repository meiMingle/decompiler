package dev.shota.decompiler.old.menu.view.items

import dev.shota.decompiler.old.container.Code
import dev.shota.decompiler.old.container.Container
import dev.shota.decompiler.old.menu.MenuItem
import java.awt.event.ActionEvent
import java.awt.event.KeyEvent

class ZoomOut : MenuItem("view.zoomOut", KeyEvent.VK_MINUS) {

    init {
        isEnabled = false

        Container.selectionModel.selectedItemProperty().addListener { _, _, value ->
            isEnabled = value != null
        }
    }

    override fun actionPerformed(e: ActionEvent?) {
        Code.changeZoom(-0.25)
    }

}