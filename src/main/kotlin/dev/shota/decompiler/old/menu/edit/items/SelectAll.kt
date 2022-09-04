package dev.shota.decompiler.old.menu.edit.items

import javafx.application.Platform
import dev.shota.decompiler.old.container.Code
import dev.shota.decompiler.old.container.Container
import dev.shota.decompiler.old.menu.MenuItem
import java.awt.event.ActionEvent
import java.awt.event.KeyEvent

class SelectAll : MenuItem("edit.selectAll", KeyEvent.VK_A) {

    init {
        isEnabled = false
        Container.selectionModel.selectedItemProperty().addListener { _, _, value ->
            isEnabled = value != null
        }
    }

    override fun actionPerformed(e: ActionEvent?) {
        Platform.runLater {
            (Container.selectionModel.selectedItem as Code).run {
                codeArea.selectAll()
            }
        }
    }

}