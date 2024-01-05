package app.edmeproject

import android.os.Parcel
import android.os.Parcelable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.Saver
import androidx.compose.runtime.saveable.SaverScope

enum class ProductType {
    PHONE,
    TV,
    JOYSTICK,
    KEYBOARD,
    HEADPHONE,
    NOTEBOOK,
    PC,
    NONE
}

class ProductItem(val name: String = "",
                  val price: String = "",
                  val image: Int = 0,
                  val description: String = "",
                  val type: ProductType = ProductType.NONE,
                  var selectedAmount: MutableState<String> = mutableStateOf("0"),
                  var basketAmount: MutableState<String> = mutableStateOf("0")) : Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readString()!!,
        parcel.readString()!!,
        parcel.readInt(),
        parcel.readString()!!,
        ProductType.valueOf(parcel.readString()!!),
        mutableStateOf(parcel.readString()!!),
        mutableStateOf(parcel.readString()!!)
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(name)
        parcel.writeString(price)
        parcel.writeInt(image)
        parcel.writeString(description)
        parcel.writeString(this.type.name)
        parcel.writeString(this.selectedAmount.value)
        parcel.writeString(this.basketAmount.value)
    }

    override fun describeContents() = 0

    companion object CREATOR : Parcelable.Creator<ProductItem> {
        override fun createFromParcel(parcel: Parcel): ProductItem {
            return ProductItem(parcel)
        }

        override fun newArray(size: Int): Array<ProductItem?> {
            return arrayOfNulls(size)
        }
    }
}

val itemsWholeList = listOf(
    ProductItem("DualSense Wireless Controller ",
        "\$209.99",
        R.drawable.photo_3,
        "Main characteristics\n" +
                "Type: Gamepad\n" +
                "Compatibility: Sony PlayStation 5\n" +
                "Interface: USB, Bluetooth ",
        ProductType.JOYSTICK,
        mutableStateOf("0"),
        mutableStateOf("0")),
    ProductItem("HyperX Cloud Stinger Core PC Headset (HX-HSCSC2-BK / WW) ",
        "\$127.00",
        R.drawable.photo_2,
        "Main characteristics\n" +
                "Device type: Headphones with microphone\n" +
                "Connection type: Wired\n" +
                "Max. cable length (reach): 3 m\n" +
                "Headphone Construction: Monitor\n" +
                "Headphone acoustic design: Closed ",
        ProductType.HEADPHONE,
        mutableStateOf("0"),
        mutableStateOf("0")),
    ProductItem("Keyboard Defender Mayhem GK-360DL ",
        "\$25.00",
        R.drawable.photo_1,
        "Main characteristics\n" +
                "Keyboard type: Gaming\n" +
                "Keyboard Connection Type: Wired\n" +
                "Keyboard connection interface: USB\n" +
                "Switch Technology: Membrane\n" +
                "Key Illumination: Yes ",
        ProductType.KEYBOARD,
        mutableStateOf("0"),
        mutableStateOf("0")),
    ProductItem("Honor MagicBook X14 NBR-WAI9 Notebook ",
        "\$1625.00",
        R.drawable.photo_4,
        "Main characteristics\n" +
                "Screen: 14.0 \"1920x1080 p, IPS 60 Hz, 250 cd / m2\n" +
                "Processor: Intel Core-i3 10110U 2-core, 2.1 GHz - 4.1 GHz, Comet Lake\n" +
                "Graphics: Integrated Intel UHD Graphics 620\n" +
                "Memory: 8GB DDR4 RAM, 256GB SSD\n" +
                "Operating system version: Windows 10\n" +
                "Weight and dimensions: 1.4 kg, 322 mm x 215 mm x 16 mm ",
        ProductType.NOTEBOOK,
        mutableStateOf("0"),
        mutableStateOf("0")),

)