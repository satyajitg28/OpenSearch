/*
 * SPDX-License-Identifier: Apache-2.0
 *
 * The OpenSearch Contributors require contributions made to
 * this file be licensed under the Apache-2.0 license or a
 * compatible open source license.
 */

package org.opensearch.translogs.s3;

import org.opensearch.index.translog.ChannelFactory;
import org.opensearch.index.translog.Checkpoint;
import org.opensearch.index.translog.NewTranslogReader;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Path;

public class S3TranslogReader extends NewTranslogReader {
    private final Checkpoint checkpoint;

    public S3TranslogReader(final Checkpoint checkpoint) {
        super(checkpoint);
        this.checkpoint = checkpoint;
    }

    @Override
    public NewTranslogReader open(FileChannel channel, Path path, Checkpoint checkpoint, String translogUUID) throws IOException {
        return null;
    }

    @Override
    public NewTranslogReader closeIntoTrimmedReader(long aboveSeqNo, ChannelFactory channelFactory) throws IOException {
        return null;
    }

    @Override
    public void readBytes(ByteBuffer buffer, long position) throws IOException {

    }

    @Override
    public void close() throws IOException {

    }
}
