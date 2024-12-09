package com.example.practica8

enum class ResourceType {
    IMAGE, AUDIO, VIDEO, WEB
}

data class Resource(
    val name: String,
    val comment: String,
    val url: String,
    val type: ResourceType
) {
    override fun toString(): String {
        return "$name, $comment, $url, $type\n"
    }
}