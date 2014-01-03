package org.heromob.scarab.processor

import org.heromob.scarab.container.ImageContainer
import org.heromob.scarab.domain.ColorSpace

trait ImageProcessor {

  def crop(x : Integer, y : Integer, h : Integer, w : Integer) : Option[ImageContainer]
  def resize(h : Integer, w : Integer) : Option[ImageContainer]
  def resample(dpi : Integer) : Option[ImageContainer]
  def recolor(depth : Integer) : Option[ImageContainer]
  def recolor(space : ColorSpace) : Option[ImageContainer]
  def recolor(depth : Integer, space : ColorSpace) : Option[ImageContainer]
  def rotate(degrees : Integer) : Option[ImageContainer]
  
}