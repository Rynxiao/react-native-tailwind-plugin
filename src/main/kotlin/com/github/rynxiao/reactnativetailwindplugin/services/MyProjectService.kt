package com.github.rynxiao.reactnativetailwindplugin.services

import com.github.rynxiao.reactnativetailwindplugin.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
