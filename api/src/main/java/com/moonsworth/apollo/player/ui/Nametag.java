package com.moonsworth.apollo.player.ui;

import com.moonsworth.apollo.option.type.RenderableString;
import lombok.Value;

import java.util.List;
import java.util.UUID;

/**
 * Represents a nametag which can be shown on the client.
 *
 * @since 1.0.0
 */
@Value(staticConstructor = "of")
public class Nametag {

    /**
     * Returns the nametag player {@link UUID} uuid.
     *
     * @return the heart texture type
     * @since 1.0.0
     */
    UUID player;

    /**
     * Returns the nametag {@link Boolean} hide state.
     *
     * @return the hide state
     * @since 1.0.0
     */
    boolean hide;

    /**
     * Returns a {@link List} of {@link RenderableString} nametag.
     *
     * @return the nametag
     * @since 1.0.0
     */
    List<RenderableString> nametag;

    /**
     * Returns the nametag {@link Integer} player name index.
     * <p>
     * Used to attach the lunar logo
     *
     * @return the player name index
     * @since 1.0.0
     */
    int playerNameIndex;
}
