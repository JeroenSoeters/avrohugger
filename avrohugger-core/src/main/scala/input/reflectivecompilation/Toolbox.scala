package avrohugger
package input
package reflectivecompilation

import scala.reflect.runtime.universe._
import scala.reflect.runtime.currentMirror
import scala.tools.reflect.ToolBox

object Toolbox {
	lazy val toolBox = currentMirror.mkToolBox()
}