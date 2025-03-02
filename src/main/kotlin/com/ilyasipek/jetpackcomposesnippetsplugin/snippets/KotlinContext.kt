package com.ilyasipek.jetpackcomposesnippetsplugin.snippets

import com.intellij.codeInsight.template.TemplateActionContext
import com.intellij.codeInsight.template.TemplateContextType

class KotlinContext : TemplateContextType("Compose snippets") {
    override fun isInContext(templateActionContext: TemplateActionContext): Boolean {
        return templateActionContext.file.name.endsWith(".kt")
    }
}