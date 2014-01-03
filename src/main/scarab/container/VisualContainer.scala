package org.heromob.scarab.container

import org.heromob.scarab.domain.ColorSpace

trait VisualContainer extends MediaContainer {

  def height : Integer
  def width : Integer
  def density : Integer
  def bitDepth : Integer
  def colorSpace : ColorSpace

}