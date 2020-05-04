package com.hellodiffa.flowerclassification

data class Recognition(
    var id: String = "",
    var title: String = "",
    var confidence: Float = 0F
) {
    override fun toString(): String {
        return """
                Result : ${title}
                Confidence : ${confidence}
            """.trimIndent()
    }
}