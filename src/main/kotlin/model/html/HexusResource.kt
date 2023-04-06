package model.html

import java.sql.Time
import java.util.*

data class HexusResource(
    var server_Name : String? = null,
    var ram_Used: String? = null,
    var ram_Free: String? = null,
    var drive_Full: String? = null,
    var drive_Usable: String? = null,
    var service_Sql : Boolean = false,
    var service_ManagementDatabase : Boolean = false,
    var service_Api: Boolean = false,
    var service_Acs : Boolean = false,
    var service_Management: Boolean = false,
    var service_Media : Boolean = false,
    var service_Mirroring: Boolean = false,
    var service_Recording: Boolean = false,
    var service_VoiceMail : Boolean = false,
    var service_X : Boolean = false,
    var service_Storage : Boolean = false,
    var service_PlainCTI : Boolean = false,
    var bootTime: String? = null,
    var upTime: Int? = null

)
