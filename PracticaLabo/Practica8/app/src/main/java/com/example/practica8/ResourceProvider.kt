package com.example.practica8


class ResourceProvider {
    companion object {
        val ResourceList = listOf<Resource>(
            Resource(
                "Gambito de Dama",
                "Serie de ajedrez de netflix",
                "https://www.netflix.com/ar/title/80234304",
                ResourceType.VIDEO
            ),
            Resource(
                "Twitch",
                "Sitio web de streaming",
                "https://www.twitch.tv/p/en/watch/",

                ResourceType.WEB
            ),
            Resource(
                "Super Mario Bros",
                "Cancion de super mario",
                "https://www.youtube.com/watch?v=NTa6Xbzfq1U",
                ResourceType.AUDIO
            ),
            Resource(
                "Fantasma",
                "Efecto de sonido de fantasma",
                "https://www.youtube.com/watch?v=s4s0S3ejo1Q",
                ResourceType.AUDIO
            ),
            Resource(
                "Campanas",
                "Efecto de sonido de campanas",
                "https://www.youtube.com/watch?v=Nmy8kY1QAKM",
                ResourceType.AUDIO
            ),
            Resource(
                "Instagram",
                "Red social",
                "https://www.instagram.com/",
                ResourceType.WEB
            )
        )

        override fun toString(): String {
            var str = ""
            ResourceList.forEach {
                resource -> str += resource.toString()
            }
            return str
        }
    }
}