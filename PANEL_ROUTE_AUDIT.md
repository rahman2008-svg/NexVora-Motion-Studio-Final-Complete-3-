# Panel route audit

Each Panel route in the `when` of `PanelHost` is listed separately. **No route is counted as Fully redesigned**: none has had its whole inner layout replaced. "Partially redesigned" means something in its layout or components really changed. "(direct calls)" means the panel file calls a shared component I reworked; I did not check per tab whether that is the whole panel or one tab. Nothing was tested on a device.

Routes found: 48.

| Route | Composable | File | Status | What changed |
|---|---|---|---|---|
| `Panel.Speed` | `SpeedPanel` | `PanelHost.kt` | Partially redesigned (direct calls) | Its own body calls the reworked shared ChoiceTile (helpers it calls were not followed); inner layout otherwise original |
| `Panel.Volume` | `VolumePanel` | `PanelHost.kt` | Partially redesigned (direct calls) | Its own body calls the reworked shared SwitchRow (helpers it calls were not followed); inner layout otherwise original |
| `Panel.Opacity` | `OpacityPanel` | `PanelHost.kt` | Partially redesigned | New header: name and large cyan numeric value above the slider (layout changed); slider and patch logic untouched |
| `Panel.Fade` | `FadePanel` | `PanelHost.kt` | Layout redesigned (source only; not compiled or run) | Two side-by-side cards (Fade in / Fade out), each with its length in large numerals, a ramp drawing to scale, and its slider. Same patch keys fadeIn/fadeOut |
| `Panel.Ratio` | `RatioPanel` | `PanelHost.kt` | Layout redesigned (source only; not compiled or run) | Stage showing the current frame at true proportions, size readout, and ratio pills; same setCanvas/collage re-layout command |
| `Panel.Transition` | `TransitionPanel` | `PanelHost.kt` | Partially redesigned (direct calls) | Its own body calls the reworked shared ChoiceGrid, GridTile, SearchField, Tabs (helpers it calls were not followed); inner layout otherwise original |
| `Panel.Packages` | `PackagesPanel` | `Pickers.kt` | Partially redesigned | Effects/filter picker: pills, 12dp tiles with cyan ring, search field, favourites chip, empty state |
| `Panel.Adjust` | `AdjustPanel` | `Pickers.kt` | Partially redesigned | Reset cyan; tab row via Pickers.kt; slider layout unchanged |
| `Panel.Quality` | `LookPanel` | `Pickers.kt` | Partially redesigned | Opens the Look panel on its third tab (see Look) |
| `Panel.Text` | `TextPanel` | `TextPanels.kt` | Partially redesigned (direct calls) | Its own body calls the reworked shared Tabs (helpers it calls were not followed); inner layout otherwise original |
| `Panel.Stickers` | `StickersPanel` | `Stickers.kt` | Partially redesigned (direct calls) | Its own body calls the reworked shared ChoiceGrid, SearchField (helpers it calls were not followed); inner layout otherwise original |
| `Panel.Animation` | `AnimationPanel` | `OtherPanels.kt` | Color only | Palette: grey literals remapped, selection ring cyan, Reset cyan where present; layout original |
| `Panel.Crop` | `CropPanel` | `CropPage.kt` | Layout redesigned (source only; not compiled or run) | Control area rebuilt: Rotate header with value and Reset, ruler, aspect-ratio tiles; the crop canvas and its gestures are unchanged |
| `Panel.Background` | `BackgroundPanel` | `OtherPanels.kt` | Layout redesigned (source only; not compiled or run) | Current-background header (swatch + name), Apply to all as a button, choices as new tiles/swatches; same session commands |
| `Panel.Voiceover` | `VoiceoverPanel` | `OtherPanels.kt` | Layout redesigned (source only; not compiled or run) | Recorder column (status/timer, ringed record button, hint) beside option rows (Teleprompter, Enhance voice, Voice changer with pill chooser); recorder logic untouched |
| `Panel.SoundFx` | `SoundFxPanel` | `SoundFx.kt` | Partially redesigned (direct calls) | Its own body calls the reworked shared SearchField, Tabs (helpers it calls were not followed); inner layout otherwise original |
| `Panel.Transcript` | `TranscriptPanel` | `Transcript.kt` | Color only | Palette: grey literals remapped, selection ring cyan, Reset cyan where present; layout original |
| `Panel.Draw` | `DrawPanel` | `Draw.kt` | Color only | Palette: grey literals remapped, selection ring cyan, Reset cyan where present; layout original |
| `Panel.Tracking` | `TrackingPanel` | `Tracking.kt` | Color only | Palette: grey literals remapped, selection ring cyan, Reset cyan where present; layout original |
| `Panel.Enhance` | `EnhancePanel` | `Enhance.kt` | Layout redesigned (source only; not compiled or run) | Header with state text, primary Enhance/Show original action, progress card with Stop; same enhance/cancel calls |
| `Panel.Captions` | `AutoCaptionsSheet` | `AutoCaptions.kt` | Color only | Palette: grey literals remapped, selection ring cyan, Reset cyan where present; layout original |
| `Panel.Lyrics` | `AutoCaptionsSheet` | `AutoCaptions.kt` | Color only | Palette: grey literals remapped, selection ring cyan, Reset cyan where present; layout original |
| `Panel.Speech` | `SpeechPanel` | `SpeechPanel.kt` | Partially redesigned (direct calls) | Its own body calls the reworked shared CheckChip (helpers it calls were not followed); inner layout otherwise original |
| `Panel.RemoveBg` | `RemoveBgPanel` | `RemoveBgPanel.kt` | Color only | Palette: grey literals remapped, selection ring cyan, Reset cyan where present; layout original |
| `Panel.Chroma` | `ChromaPanel` | `RemoveBgPanel.kt` | Color only | Palette: grey literals remapped, selection ring cyan, Reset cyan where present; layout original |
| `Panel.Blend` | `BlendPanel` | `PanelHost.kt` | Partially redesigned (direct calls) | Its own body calls the reworked shared ChoiceTile (helpers it calls were not followed); inner layout otherwise original |
| `Panel.Mask` | `MaskPanel` | `MaskPanel.kt` | Color only | Palette: grey literals remapped, selection ring cyan, Reset cyan where present; layout original |
| `Panel.Basic` | `BasicPanel` | `BasicPanel.kt` | Partially redesigned | Position/Zoom/Rotate tabs are the shared pill tabs; Reset cyan |
| `Panel.CustomCutout` | `CustomCutoutPanel` | `CustomCutout.kt` | Color only | Palette: grey literals remapped, selection ring cyan, Reset cyan where present; layout original |
| `Panel.ShapeStyle` | `ShapeStylePanel` | `ShapeStyle.kt` | Partially redesigned | Fill/Outline tabs are the shared pill tabs |
| `Panel.CaptionTemplates` | `CaptionTemplatesPanel` | `AutoCaptions.kt` | Color only | Palette: grey literals remapped, selection ring cyan, Reset cyan where present; layout original |
| `Panel.Collage` | `CollagePanel` | `Collage.kt` | Color only | Palette: grey literals remapped, selection ring cyan, Reset cyan where present; layout original |
| `Panel.Relight` | `RelightPanel` | `Relight.kt` | Layout redesigned (source only; not compiled or run) | Pill row (None + categories), strength header with light name and value, 12dp sample tiles; same relight chain writes |
| `Panel.Sounds` | `SoundsPage` | `SoundsPage.kt` | Color only | Palette: grey literals remapped, selection ring cyan, Reset cyan where present; layout original |
| `Panel.CameraTracking` | `CameraTrackingPanel` | `Tracking.kt` | Color only | Palette: grey literals remapped, selection ring cyan, Reset cyan where present; layout original |
| `Panel.MotionBlur` | `MotionBlurPanel` | `MotionBlur.kt` | Layout redesigned (source only; not compiled or run) | Sliders in one card with numeric values; Direction and Times as visible pills instead of menus; progress card; same run/cancel calls |
| `Panel.BodyEffects` | `BodyEffectsPanel` | `BodyEffects.kt` | Partially redesigned (direct calls) | Its own body calls the reworked shared ChoiceGrid, GridTile (helpers it calls were not followed); inner layout otherwise original |
| `Panel.IsolateVoice` | `IsolateVoicePanel` | `IsolateVoice.kt` | Layout redesigned (source only; not compiled or run) | Original / Voice only segmented switch, progress card with Stop; same isolateVoice/cancel calls |
| `Panel.AutoReframe` | `AutoReframePanel` | `AutoReframe.kt` | Layout redesigned (source only; not compiled or run) | Output-shape stage with pills, Reframe action or progress card; same setCanvas/autoReframe calls |
| `Panel.Retouch` | `RetouchPanel` | `Retouch.kt` | Layout redesigned (source only; not compiled or run) | Two icon cards (Smooth, Brighten) with hint, value and slider; same capcraft.retouch chain writes |
| `Panel.Graphs` | `GraphsPanel` | `GraphsPanel.kt` | Partially redesigned (direct calls) | Its own body calls the reworked shared ChoiceTile (helpers it calls were not followed); inner layout otherwise original |
| `Panel.Layer` | `LayerPanel` | `LayerPanel.kt` | Color only | Palette: grey literals remapped, selection ring cyan, Reset cyan where present; layout original |
| `Panel.EffectObject` | `EffectObjectPanel` | `EffectLayer.kt` | Layout redesigned (source only; not compiled or run) | Two selectable option rows (All videos / Main video) with thumbnail, description and a radio mark; same setReach edit |
| `Panel.LayerAdjust` | `LayerAdjustPanel` | `EffectLayer.kt` | Layout redesigned (source only; not compiled or run) | One card per effect setting with name, numeric value and slider; Reset as a button; same setKnob writes |
| `Panel.EnterCaptions` | `EnterCaptionsPage` | `EnterCaptions.kt` | Color only | Palette: grey literals remapped, selection ring cyan, Reset cyan where present; layout original |
| `Panel.BatchEdit` | `BatchEditPanel` | `BatchEditPanel.kt` | Color only | Palette: grey literals remapped, selection ring cyan, Reset cyan where present; layout original |
| `Panel.Beats` | `BeatsPanel` | `BeatsPanel.kt` | Color only | Palette: grey literals remapped, selection ring cyan, Reset cyan where present; layout original |
| `Panel.Stabilize` | `StabilizePanel` | `StabilizePanel.kt` | Layout redesigned (source only; not compiled or run) | Strength header with named level, stop slider with highlighted label, progress card with Cancel; same stabilize/cancel calls |

Totals: Partially redesigned (direct calls): 10, Partially redesigned: 6, Layout redesigned (source only; not compiled or run): 14, Color only: 18.

## Tabs and sections inside panels

| Panel | Tabs | Status |
|---|---|---|
| Basic | Position, Zoom, Rotate | Shared pill tabs; rulers unchanged |
| Shape style | Fill, Outline | Shared pill tabs; controls unchanged |
| Filters (Look) | tab row via `startTab` | Pills and tiles; the Presets and Adjust tab contents keep original layouts |
| Effects / filter packages | categories | Pills, tiles, search, favourites |
| Text | style tabs | Active tab text cyan; contents original |
| Audio effects, Draw, Mask, Relight | tab rows | Active tab text cyan; contents original |
| Background (Color, Image, Blur) | 3 tabs | Not individually verified |

## Not done
Every route marked Color only or Partially redesigned keeps most of its original inner layout.
