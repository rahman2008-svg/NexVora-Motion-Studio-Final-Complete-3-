# NexVora Motion design system

Defined in `ui/Theme.kt` (tokens) and `ui/common/NexVora.kt` (components); XML tokens in `res/values/colors.xml`.

## Colour
| Token | Value | Use |
|---|---|---|
| `Palette.Black` | #090B12 | App background, preview stage |
| `Palette.Panel` | #111522 | Sheets, secondary background |
| `Palette.Card` | #171D2B | Cards, chips, rows |
| `Palette.Elevated` | #20283A | Dialogs, action sheets, toasts |
| `Palette.Accent` | #00D5FF | Selection, playhead, links, active icons |
| `Palette.Purple` | #8957FF | Secondary accent, effect clips |
| `Palette.Text` / `TextSecondary` / `TextTertiary` | #F7F9FF / #9AA5B8 / #657187 | Text, secondary text, muted text |
| `Palette.Divider` | #283044 | Borders and hairlines |
| `Palette.PrimaryBrush` | #00D5FF to #4F9BFF | Primary buttons only |
| `Success` #25D695, `Warning` #FFB547, `Danger` #FF5572, `Disabled` #454D60 | | States |
Editor surfaces (`EditorTop`, `Timeline`, `DockSelected`, `Chip`, and similar) are navy-tinted variants of the above.

## Shape and space
`NexShape`: Chip 8dp, Button 12dp, Card 16dp, PanelTop/PanelBottom 20dp (editing panels, export settings), Dialog 24dp, Sheet 24dp top corners. `Space`: 4, 8, 12, 16, 24dp. Touch targets: 44dp (`NexVoraIconButton`, buttons have a 44dp minimum).

## Type
`Type.Display` 32 bold, `Headline` 22 bold, `Title` 17, `Subtitle` 15, `BodyStrong`, `Body` 14, `Small`, `Label` 12, `Caption` 11, `DockLabel`, `Numeric` (14 semibold, tabular digits, for slider/ruler values; defined, not yet applied to the sliders).

## Components
`NexVoraPrimaryButton` (cyan, `destructive` red), `NexVoraSecondaryButton`, `NexVoraIconButton`, `NexVoraCard` (optionally clickable), `NexVoraSectionHeader`, `NexVoraEmptyState`, `NexVoraLoadingState`, `NexVoraErrorState`, `NexVoraGrabber`, `NexVoraChip`, `NexVoraSegmentedTabs`, `NexVoraSearchField`. Panel tabs, Projects filters, the media picker tabs and the Projects search use them. The shared `ConfirmDialog`, `ActionSheet`, `Toast`, `PanelFrame` and `CapSlider` use them or the same tokens.

## Rules
Cyan means selected or primary; purple only for effect clips and the logo; one gradient (primary button); borders 1dp Divider; no blur or glow; animations are the originals (no new ones, reduced-motion not reviewed).

## Gaps
Many panels still use inline buttons and hard-coded `Color.White`; there is no slider component beyond `CapSlider` and the export sheet's own stepped slider.
