package net.pryoscode.decompiler.window.code

import javafx.collections.ListChangeListener
import javafx.scene.control.ContextMenu
import javafx.scene.control.MenuItem
import javafx.scene.control.Tab
import javafx.scene.control.TabPane
import net.pryoscode.decompiler.window.sidebar.Entry
import org.fxmisc.flowless.VirtualizedScrollPane
import org.fxmisc.richtext.CodeArea
import org.fxmisc.richtext.LineNumberFactory

class Preview(tabPane: TabPane, entry: Entry, code: String) : Tab() {

    init {
        text = entry.name

        val codeArea = CodeArea(code)
        codeArea.isEditable = false
        codeArea.paragraphGraphicFactory = LineNumberFactory.get(codeArea)
        content = VirtualizedScrollPane(codeArea)

        val menu = ContextMenu()
        val close = MenuItem("Close")
        val closeOthers = MenuItem("Close Others")
        val closeAll = MenuItem("Close All")
        tabPane.tabs.addListener(ListChangeListener {
            val multiple = tabPane.tabs.size == 1
            closeOthers.isDisable = multiple
            closeAll.isDisable = multiple
        })
        close.setOnAction { tabPane.tabs.remove(this) }
        closeOthers.setOnAction {
            val tabs = tabPane.tabs.iterator()
            while (tabs.hasNext()) {
                if (!tabs.next().equals(this))
                    tabs.remove()
            }
        }
        closeAll.setOnAction { tabPane.tabs.clear() }
        menu.items.addAll(close, closeOthers, closeAll)
        contextMenu = menu

        tabPane.tabs.add(this)
        tabPane.selectionModel.select(this)
    }

}