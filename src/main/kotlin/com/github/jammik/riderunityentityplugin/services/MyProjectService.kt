package com.github.jammik.riderunityentityplugin.services

import com.github.jammik.riderunityentityplugin.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
