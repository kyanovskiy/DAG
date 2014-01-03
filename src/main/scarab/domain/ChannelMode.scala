package org.heromob.scarab.domain

sealed trait ChannelMode

case object MONO extends ChannelMode
case object STEREO extends ChannelMode
