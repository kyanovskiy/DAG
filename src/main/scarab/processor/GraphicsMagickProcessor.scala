package org.heromob.scarab.processor

import org.heromob.scarab.container.MediaContainer
import org.heromob.scarab.domain.MediaType
import org.heromob.scarab.domain.MediaFormat
import org.heromob.scarab.container.ImageContainer
import org.heromob.scarab.domain.ColorSpace
import scala.sys.process._

class GraphicsMagickProcessor extends NativeCommandProcessor with ImageProcessor with ImageSeqProcessor {

  /////////////////////
  // MediaOperations
  /////////////////////
  def convert(format: MediaFormat): Option[MediaContainer] = {
		  
  }
  
  def convert(typ: MediaType): Option[MediaContainer]
  def convert(format: MediaFormat, typ: MediaType): Option[MediaContainer]

  /////////////////////
  // Image Operations
  /////////////////////
  def crop(x: Integer, y: Integer, h: Integer, w: Integer): Option[ImageContainer]
  def resize(h: Integer, w: Integer): Option[ImageContainer]
  def resample(dpi: Integer): Option[ImageContainer]
  def recolor(depth: Integer): Option[ImageContainer]
  def recolor(space: ColorSpace): Option[ImageContainer]
  def recolor(depth: Integer, space: ColorSpace): Option[ImageContainer]
  def rotate(degrees: Integer): Option[ImageContainer]
}