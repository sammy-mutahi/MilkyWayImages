package com.sammy.presentation

import com.google.common.truth.Truth
import com.sammy.presentation.utils.formatDate
import com.sammy.presentation.utils.toDate
import org.junit.Test

class DateExtensionsTest {
    @Test
    fun `Format date, positive test, Return Expected Date`() {
        val sampleDate = "2017-12-08T00:00:00Z"
        val validDate = sampleDate.toDate().formatDate("yyyy-MM-dd")
        Truth.assertThat(validDate).isEqualTo("2017-12-08")
    }

    @Test
    fun `Format date, negative test, Return unexpected Date`() {
        val sampleDate = "2017-12-08T00:00:00Z"
        val inValidDate = sampleDate.toDate().formatDate("dd-MM-yyyy")
        Truth.assertThat(inValidDate).isNotEqualTo("2017-12-08")
    }
}