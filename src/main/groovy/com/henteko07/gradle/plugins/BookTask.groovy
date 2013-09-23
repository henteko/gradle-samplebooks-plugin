package com.henteko07.gradle.plugins

import org.gradle.api.DefaultTask
import org.gradle.api.tasks.TaskAction

class BookTask extends DefaultTask {
    @TaskAction
    def allBookRead() {
        println "your config key: ${project.sample.configKey}"
        println ""

        def books = project.sampleBooks
        println "books size: ${books.size()}"
        println ""
        for(book in books) {
            println "setting name: ${book.name}"
            println "title: ${book.title}"
            println "body: ${book.body}"
            println ""
        }
    }
}
