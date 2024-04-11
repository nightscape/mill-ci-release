package io.kipp.mill.ci.release

sealed trait SonatypeHost {
  def host: String
  def uri: String = s"https://$host/service/local"
  def snapshotUri: String = s"https://$host/content/repositories/snapshots"
}
object SonatypeHost {
  case object Legacy extends SonatypeHost {
    def host = "oss.sonatype.org"
  }
  case object s01 extends SonatypeHost {
    def host = "s01.oss.sonatype.org"
  }
}
