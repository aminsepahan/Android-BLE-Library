package no.nordicsemi.andorid.ble.test.client.data

val splitterRequest = """
    Lorem ipsum dolor sit amet. Ab vitae odio eos veniam exercitationem qui totam provident in
    earum eveniet sed suscipit libero est temporibus eius. Ut Quis deserunt sit ipsa earum cum
    esse tenetur id pariatur delectus vel sapiente exercitationem est harum dolore et accusantium
    dicta. Qui officia dolor ut provident numquam sit dolor quae sit ipsum dolores et autem rerum.
    Est maxime nihil aut beatae excepturi ut rerum explicabo.Et ullam expedita cum cupiditate
    doloremque cum omnis incidunt sed dolores maxime sed voluptatibus quisquam. Qui recusandae
    ipsam qui iste quia sit deleniti mollitia. Qui totam dolorem et ipsa dolor a architecto omnis ab
    consectetur eveniet. Ex quae laborum id doloribus tenetur non porro dolorum et assumenda nesciunt est
    nihil enim eos provident officiis. Est itaque nostrum vel accusantium reiciendis nam omnis sunt ad
    autem omnis ut consequatur inventore. Cum consequatur Cum consequatur Cum consequatur consequatur Cum Cumm it is.this is it
    """.toByteArray()

val reliableRequest = "This is reliable write request.".toByteArray()
val secondReliableRequest = "This is second reliable write request".toByteArray()
val writeRequest = "This is a write request".toByteArray()
val atomicRequestQueue = "This is write request in an atomic request queue".toByteArray()

const val SCANNING_FOR_SERVER = "Scanning for Server"
const val CONNECTED_WITH_SERVER = "Connected with Server"
const val SERVICE_DISCOVERY = "Service Discovery"
const val WRITE_CHARACTERISTICS = "Write Characteristics"
const val RELIABLE_WRITE = "Begin Reliable Write"
const val ATOMIC_REQUEST_QUEUE = "Begin Atomic Request Queue"
const val FLAG_BASED_SPLITTER = "Write with flag based splitter"
const val DEFAULT_MTU_SPLITTER = "Write with default mtu size splitter"
const val HEADER_BASED_SPLITTER = "Write with header based splitter"
const val SET_INDICATION = "Set Indication Callback"
const val SET_NOTIFICATION = "Set Notification Callback"
const val ENABLE_INDICATION = "Enable Indication"
const val ENABLE_NOTIFICATION = "Enable Notification"
const val READ_CHA = "Read Characteristics"
const val WAIT_FOR_INDICATION_CALLBACK = "Wait for Indication callback"
const val REMOVE_INDICATION_CALLBACK = "Remove Indication callback"
const val WAIT_FOR_NOTIFICATION_CALLBACK = "Wait for Notification callback"
const val REMOVE_NOTIFICATION_CALLBACK = "Remove Notification callback"