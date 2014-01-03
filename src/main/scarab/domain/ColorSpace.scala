package org.heromob.scarab.domain

sealed trait ColorSpace

case object RGB extends ColorSpace
case object sRGB extends ColorSpace
case object CYMK extends ColorSpace
case object GRAY extends ColorSpace
