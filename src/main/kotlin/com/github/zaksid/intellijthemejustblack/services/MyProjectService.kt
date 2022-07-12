package com.github.zaksid.intellijthemejustblack.services

import com.intellij.openapi.project.Project
import com.github.zaksid.intellijthemejustblack.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
