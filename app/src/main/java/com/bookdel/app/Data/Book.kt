package com.bookdel.app.Data

import androidx.compose.ui.graphics.vector.ImageVector
import java.util.Date

data class Book(
    val name: String? = null,
    val image: ImageVector,
    val author: String? = null,
    val publishedDate: Date? = null,
    val cost: Int? = null,
    val category: BookCategory = BookCategory.UNKNOWN
)

enum class BookCategory {
    FICTION,
    NON_FICTION,
    BIOGRAPHY_AUTOBIOGRAPHY,
    HISTORY,SCIENCE,
    TECHNOLOGY_ENGINEERING,
    SOCIAL_SCIENCES,
    ARTS_LITERATURE,
    RELIGION_PHILOSOPHY,
    REFERENCE,
    TRAVEL,
    UNKNOWN
}
