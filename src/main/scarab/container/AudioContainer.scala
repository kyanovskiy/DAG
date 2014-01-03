package org.heromob.scarab.container

import org.heromob.scarab.domain.ChannelMode

trait AudioContainer {

  def bitRate : Integer
  def bitDepth : Integer
  def sampleRate : Integer
  def channelMode : ChannelMode
  
}