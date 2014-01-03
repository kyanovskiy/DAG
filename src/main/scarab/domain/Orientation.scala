package org.heromob.scarab.domain

sealed trait Orientation

case object PORTRAIT extends Orientation
case object LANDSCAPE extends Orientation
