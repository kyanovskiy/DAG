package org.heromob.scarab.domain

sealed trait MediaFormat

case  object PNG extends MediaFormat
case  object JPG extends MediaFormat
case  object SVG extends MediaFormat
case  object BMP extends MediaFormat
case  object GIF extends MediaFormat
case  object PS extends MediaFormat
case  object PDF extends MediaFormat
case  object TIFF extends MediaFormat
