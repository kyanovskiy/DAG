package org.heromob.scarab.container

import org.heromob.scarab.domain.MediaFormat
import org.heromob.scarab.domain.MediaType
import org.heromob.scarab.processor.ProcessorStrategy

trait MediaContainer {

  def format : MediaFormat
  def typ : MediaType
  def empty : Boolean
  def mimeType : String
  def processorStrategy : ProcessorStrategy

}