package com.teacher.utils

/**
 * 作者: wesley
 * 日期: 2021/5/19
 * 描述:
 */
object StringUtils {


    fun isMobile(phoneNumber: String): Boolean {
        return phoneNumber.length == 11
    }


    fun isIdCard(number: String): Boolean{
        return number.length == 12
    }

}