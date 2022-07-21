package com.lzx.starrysky.decrypt;

import androidx.annotation.Nullable;

import com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist;
import com.google.android.exoplayer2.source.hls.playlist.HlsMultivariantPlaylist;
import com.google.android.exoplayer2.source.hls.playlist.HlsPlaylist;
import com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistParser;
import com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistParserFactory;
import com.google.android.exoplayer2.upstream.ParsingLoadable;

/**
 * @author Vincent
 * @date 2022/7/21
 * @description
 */
public class DefaultFilePlaylistParserFactory implements HlsPlaylistParserFactory {

    @Override
    public ParsingLoadable.Parser<HlsPlaylist> createPlaylistParser() {
        return new FilePlaylistParser();
    }

    @Override
    public ParsingLoadable.Parser<HlsPlaylist> createPlaylistParser(
            HlsMultivariantPlaylist multivariantPlaylist,
            @Nullable HlsMediaPlaylist previousMediaPlaylist) {
        return new FilePlaylistParser(multivariantPlaylist, previousMediaPlaylist);
    }
}
