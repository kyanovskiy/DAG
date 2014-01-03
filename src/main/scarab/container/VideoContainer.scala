package org.heromob.scarab.container

trait VideoContainer extends VisualContainer with TemporalContainer {

  def frameRate : Float  
  def audio : AudioContainer
  
}