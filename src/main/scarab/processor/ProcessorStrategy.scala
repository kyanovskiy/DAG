package org.heromob.scarab.processor

trait ProcessorStrategy {

  var timeoutRatio = 10
  var primary: MediaProcessor
  var secondary : MediaProcessor
  var tertiary : MediaProcessor
}