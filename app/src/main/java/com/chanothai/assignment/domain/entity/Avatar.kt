package com.chanothai.assignment.domain.entity

data class Avatars(
        val results: MutableList<Avatar>
)

data class Avatar(
        val name: String,
        val status: String,
        val species: String,
        val type: String,
        val gender: String,
        val origin: Origin,
        val location: Location,
        val image: String,
        val episode: MutableList<String>,
        val url: String,
        val created: String
)

data class Origin(
        val name: String,
        val url: String
)

data class Location(
        val name: String,
        val url: String
)


