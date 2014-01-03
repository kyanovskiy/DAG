package org.heromob.scarab.domain

sealed trait MediaType

case object IMAGE extends MediaType
case object IMAGESEQ extends MediaType
case object AUDIO extends MediaType
case object VIDEO extends MediaType
