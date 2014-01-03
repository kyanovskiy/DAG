package org.heromob.scarab.container

import org.heromob.scarab.domain.Orientation
import org.heromob.scarab.domain.ColorSpace

trait ImageContainer extends MediaContainer {

  def density : Integer
  def colorDepth : Integer
  def orientation : Orientation
}