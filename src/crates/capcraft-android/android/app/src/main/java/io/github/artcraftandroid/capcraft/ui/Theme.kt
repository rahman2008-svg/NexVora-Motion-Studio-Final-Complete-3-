package io.github.artcraftandroid.capcraft.ui

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

/** NexVora Motion's palette: a deep midnight editor with cyan and electric-purple accents. */
object Palette {
    val Black = Color(0xFF090B12)
    /** The editor's chrome: top bar, timeline and dock. */
    val Chrome = Color(0xFF0D111C)
    /** Panels and sheets over the editor. */
    val Panel = Color(0xFF111522)
    /** Cards and raised rows. */
    val Card = Color(0xFF171D2B)
    val CardPressed = Color(0xFF212839)
    val Divider = Color(0xFF283044)
    val Accent = Color(0xFF00D5FF)
    /** The second accent: electric purple. */
    val Purple = Color(0xFF8957FF)
    /** Words on the accent: the Export button's dark ink. */
    val OnAccent = Color(0xFF090B12)
    /** The editor's top part: top bar, preview surround and play bar. */
    val EditorTop = Color(0xFF0E111B)
    /** The timeline and the bottom bar under it. */
    val Timeline = Color(0xFF131827)
    /** The bottom bar while a clip is selected, and the panels. */
    val DockSelected = Color(0xFF171D2B)
    /** The back button of a bottom bar level. */
    val DockBack = Color(0xFF2A3247)
    /** Labels and icons in the bottom bar. */
    val DockText = Color(0xFFD5DBE8)
    /** The resolution chip in the top bar. */
    val Chip = Color(0xFF1D2333)
    /** The "add audio" / "add text" rows and their tiles. */
    val HintRow = Color(0xFF171D2B)
    val HintIcon = Color(0xFF6C7691)
    val Text = Color(0xFFF7F9FF)
    val TextSecondary = Color(0xFF9AA5B8)
    val TextTertiary = Color(0xFF657187)
    val Disabled = Color(0xFF454D60)
    /** Timeline clip colours by row. */
    val TextClip = Color(0xFFE67300)
    /** Captions, a lighter amber than titles. */
    val CaptionClip = Color(0xFFDA9208)
    val EffectClip = Color(0xFF8957FF)
    val FilterClip = Color(0xFFE36BBF)
    val StickerClip = Color(0xFFDCB108)
    val AudioClip = Color(0xFF2A5256)
    /** Beat marks on sound clips. */
    val Beat = Color(0xFFFFD60A)
    val AudioWave = Color(0xFF00B8DB)
    val OverlayClip = Color(0xFF232A3C)
    val Danger = Color(0xFFFF5572)
    /** Dialogs, menus and sheets that sit above a Panel. */
    val Elevated = Color(0xFF20283A)
    /** A faint cyan wash for selected rows and chips. */
    val AccentSoft = Color(0x2600D5FF)
    val Success = Color(0xFF25D695)
    val Warning = Color(0xFFFFB547)
    /** The primary button: cyan easing toward a cool blue. Dark ink (OnAccent) reads on both ends. */
    val PrimaryBrush = Brush.horizontalGradient(listOf(Color(0xFF00D5FF), Color(0xFF4F9BFF)))
}

/** Corner radii: one scale for the whole app. */
object NexShape {
    val Chip = RoundedCornerShape(8.dp)
    val Button = RoundedCornerShape(12.dp)
    val Card = RoundedCornerShape(16.dp)
    /** A large panel that docks to the bottom edge (editing panels, export settings). */
    val PanelTop = RoundedCornerShape(topStart = 20.dp, topEnd = 20.dp)
    val PanelBottom = RoundedCornerShape(bottomStart = 20.dp, bottomEnd = 20.dp)
    /** Modals and bottom sheets. */
    val Dialog = RoundedCornerShape(24.dp)
    val Sheet = RoundedCornerShape(topStart = 24.dp, topEnd = 24.dp)
}

/** Spacing steps (dp). */
object Space {
    val XS = 4.dp
    val S = 8.dp
    val M = 12.dp
    val L = 16.dp
    val XL = 24.dp
}

object Type {
    val Title = TextStyle(color = Palette.Text, fontSize = 17.sp, fontWeight = FontWeight.SemiBold)
    val Body = TextStyle(color = Palette.Text, fontSize = 14.sp)
    val BodyStrong = TextStyle(color = Palette.Text, fontSize = 14.sp, fontWeight = FontWeight.Medium)
    val Small = TextStyle(color = Palette.TextSecondary, fontSize = 12.sp)
    val Tiny = TextStyle(color = Palette.TextSecondary, fontSize = 10.sp)
    val Display = TextStyle(color = Palette.Text, fontSize = 32.sp, fontWeight = FontWeight.Bold)
    val Subtitle = TextStyle(color = Palette.TextSecondary, fontSize = 15.sp, fontWeight = FontWeight.Medium)
    val Label = TextStyle(color = Palette.TextSecondary, fontSize = 12.sp, fontWeight = FontWeight.Medium)
    /** Values on sliders and rulers: semibold, fixed-width digits so they do not jiggle while dragging. */
    val Numeric = TextStyle(color = Palette.Text, fontSize = 14.sp, fontWeight = FontWeight.SemiBold, fontFeatureSettings = "tnum")
    val Headline = TextStyle(color = Palette.Text, fontSize = 22.sp, fontWeight = FontWeight.Bold)
    val Caption = TextStyle(color = Palette.TextSecondary, fontSize = 11.sp)
    val DockLabel = TextStyle(color = Palette.Text, fontSize = 10.sp)
}

@Composable
fun CapCraftTheme(content: @Composable () -> Unit) {
    MaterialTheme(
        colorScheme = darkColorScheme(
            primary = Palette.Accent,
            onPrimary = Palette.OnAccent,
            background = Palette.Black,
            surface = Palette.Panel,
            onSurface = Palette.Text,
            onBackground = Palette.Text,
            secondary = Palette.Purple,
            surfaceVariant = Palette.Card,
            error = Palette.Danger,
            outline = Palette.Divider,
        ),
        content = content,
    )
}
