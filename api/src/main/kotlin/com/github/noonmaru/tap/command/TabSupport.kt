/*
 * Copyright (c) 2020 Noonmaru
 *
 * Licensed under the General Public License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * https://opensource.org/licenses/gpl-2.0.php
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package com.github.noonmaru.tap.command

/**
 * @author Nemo
 */
fun Iterable<String>.tabComplete(label: String): List<String> {
    return filter { it.regionMatches(0, label, 0, label.count()) }
}

fun <T> Iterable<T>.tabComplete(label: String, transformer: (o: T) -> String): List<String> {
    return filter { transformer.invoke(it).regionMatches(0, label, 0, label.count()) }.map(transformer)
}