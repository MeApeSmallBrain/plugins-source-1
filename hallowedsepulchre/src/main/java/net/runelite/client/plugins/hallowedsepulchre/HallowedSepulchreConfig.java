/*
 * Copyright (c) 2020 Dutta64 <https://github.com/Dutta64>
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * 1. Redistributions of source code must retain the above copyright notice, this
 *    list of conditions and the following disclaimer.
 * 2. Redistributions in binary form must reproduce the above copyright notice,
 *    this list of conditions and the following disclaimer in the documentation
 *    and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR
 * ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package net.runelite.client.plugins.hallowedsepulchre;

import java.awt.Color;
import lombok.AllArgsConstructor;
import lombok.Getter;
import net.runelite.client.config.Alpha;
import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;
import net.runelite.client.config.ConfigTitleSection;
import net.runelite.client.config.Title;
import net.runelite.client.config.Units;

@ConfigGroup("hallowedsepulchre")
public interface HallowedSepulchreConfig extends Config
{
	Color RED_OPAQUE = new Color(255, 0, 0, 255);
	Color RED_TRANSPARENT = new Color(255, 0, 0, 20);

	@Getter
	@AllArgsConstructor
	enum HighlightMode
	{
		NONE("None"),
		OUTLINE("Outline"),
		TILE("Tile"),
		BOTH("Both");

		private String name;

		@Override
		public String toString()
		{
			return getName();
		}
	}

	@ConfigItem(
		name = "Mirror Mode Compatibility?",
		keyName = "mirrorMode",
		description = "Should we show the overlay on Mirror Mode?",
		position = 0
	)
	default boolean mirrorMode()
	{
		return false;
	}

	@ConfigTitleSection(
		keyName = "overlays",
		position = 1,
		name = "Overlays",
		description = ""
	)
	default Title overlay()
	{
		return new Title();
	}

	@ConfigItem(
		position = 0,
		keyName = "highlightArrows",
		name = "Highlight arrows",
		description = "Overlay arrows with a colored outline.",
		titleSection = "overlays"
	)
	default HighlightMode highlightArrows()
	{
		return HighlightMode.TILE;
	}

	@ConfigItem(
		position = 1,
		keyName = "highlightSwords",
		name = "Highlight swords",
		description = "Overlay swords with a colored outline.",
		titleSection = "overlays"
	)
	default HighlightMode highlightSwords()
	{
		return HighlightMode.TILE;
	}

	@ConfigItem(
		position = 2,
		keyName = "highlightCrossbowmanStatue",
		name = "Crossbow statue animation",
		description = "Overlay shooting statues with a colored outline.",
		titleSection = "overlays"
	)
	default boolean highlightCrossbowStatues()
	{
		return false;
	}

	@ConfigItem(
		position = 3,
		keyName = "highlightWizardStatue",
		name = "Wizard statue tick counter",
		description = "Overlay wizard statues with a tick counter.",
		titleSection = "overlays"
	)
	default boolean highlightWizardStatues()
	{
		return false;
	}

	@ConfigItem(
		position = 4,
		keyName = "wizardFontSize",
		name = "Tick counter font size",
		description = "Adjust the font size of the wizard statue tick counter.",
		titleSection = "overlays"
	)
	@Units(Units.POINTS)
	default int wizardFontSize()
	{
		return 12;
	}

	@ConfigItem(
		position = 5,
		keyName = "wizardFontShadow",
		name = "Tick counter font shadow",
		description = "Toggle font shadow of the wizard statue tick counter.",
		titleSection = "overlays"
	)
	default boolean wizardFontShadow()
	{
		return false;
	}

	@ConfigTitleSection(
		keyName = "colors",
		name = "Colors",
		description = "Customize overlay colors.",
		position = 2
	)
	default boolean colors()
	{
		return false;
	}

	@Alpha
	@ConfigItem(
		position = 0,
		keyName = "arrowsOutlineColor",
		name = "Arrows outline",
		description = "Change the overlay outline color of arrows.",
		titleSection = "colors"
	)
	default Color arrowsOutlineColor()
	{
		return RED_OPAQUE;
	}

	@Alpha
	@ConfigItem(
		position = 1,
		keyName = "arrowsFillColor",
		name = "Arrows fill",
		description = "Change the overlay fill color of arrows.",
		titleSection = "colors"
	)
	default Color arrowsFillColor()
	{
		return RED_TRANSPARENT;
	}

	@Alpha
	@ConfigItem(
		position = 2,
		keyName = "swordsOutlineColor",
		name = "Swords outline",
		description = "Change the overlay outline color of swords.",
		titleSection = "colors"
	)
	default Color swordsOutlineColor()
	{
		return RED_OPAQUE;
	}

	@Alpha
	@ConfigItem(
		position = 3,
		keyName = "swordsFillColor",
		name = "Swords fill",
		description = "Change the overlay fill color of swords.",
		titleSection = "colors"
	)
	default Color swordsFillColor()
	{
		return RED_TRANSPARENT;
	}

	@Alpha
	@ConfigItem(
		position = 4,
		keyName = "crossbowStatueOutlineColor",
		name = "Crossbow outline",
		description = "Change the overlay outline color of the crossbow statues.",
		titleSection = "colors"
	)
	default Color crossbowStatueOutlineColor()
	{
		return RED_OPAQUE;
	}

	@Alpha
	@ConfigItem(
		position = 5,
		keyName = "crossbowStatueFillColor",
		name = "Crossbow fill",
		description = "Change the overlay fill color of the crossbow statues.",
		titleSection = "colors"
	)
	default Color crossbowStatueFillColor()
	{
		return RED_TRANSPARENT;
	}

	@ConfigItem(
		position = 6,
		keyName = "wizardStatueTickCounterColor",
		name = "Wizard statue color",
		description = "Change the overlay color of the wizard statue tick counter.",
		titleSection = "colors"
	)
	default Color wizardStatueTickCounterColor()
	{
		return Color.RED;
	}
}