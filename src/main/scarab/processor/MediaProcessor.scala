package org.heromob.scarab.processor

import org.heromob.scarab.domain.MediaFormat
import org.heromob.scarab.container.MediaContainer
import org.heromob.scarab.domain.MediaType

trait MediaProcessor {
  
  def convert(format : MediaFormat) : Option[MediaContainer]
  def convert(typ : MediaType) : Option[MediaContainer]
  def convert(format : MediaFormat, typ : MediaType) : Option[MediaContainer]
  
}