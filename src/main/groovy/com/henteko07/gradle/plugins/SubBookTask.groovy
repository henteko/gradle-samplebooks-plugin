package com.henteko07.gradle.plugins

import org.gradle.api.DefaultTask
import org.gradle.api.tasks.TaskAction

class SubBookTask extends DefaultTask {
    String bookName

    @TaskAction
    def allBookRead() {
        println "your config key: ${project.sample.configKey}"

        def books = project.sampleBooks
        for(book in books) {
            if(bookName != book.name) continue
            
            println "setting name: ${book.name}"
            println "title: ${book.title}"
            println "body: ${book.body}"
            println ""
        }
    }
}
