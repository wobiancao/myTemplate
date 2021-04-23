package com.github.wobiancao.mytemplate.services

import com.github.wobiancao.mytemplate.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
