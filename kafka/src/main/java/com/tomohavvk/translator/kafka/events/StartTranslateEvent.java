/**
 * Autogenerated by Avro
 * <p>
 * DO NOT EDIT DIRECTLY
 */
package com.tomohavvk.translator.kafka.events;

import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.SchemaStore;
import org.apache.avro.specific.SpecificData;

@org.apache.avro.specific.AvroGenerated
public class StartTranslateEvent extends org.apache.avro.specific.SpecificRecordBase
        implements org.apache.avro.specific.SpecificRecord {
    private static final long serialVersionUID = -7992823192894891062L;

    public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse(
            "{\"type\":\"record\",\"name\":\"StartTranslateEvent\",\"namespace\":\"com.tomohavvk.translator.kafka.events\",\"fields\":[{\"name\":\"source\",\"type\":\"string\"},{\"name\":\"sourceLanguage\",\"type\":\"string\"},{\"name\":\"targetLanguage\",\"type\":\"string\"},{\"name\":\"meta\",\"type\":{\"type\":\"record\",\"name\":\"EventMeta\",\"fields\":[{\"name\":\"id\",\"type\":{\"type\":\"string\",\"logicalType\":\"uuid\"}},{\"name\":\"createdAt\",\"type\":\"string\"}]}}]}");

    public static org.apache.avro.Schema getClassSchema() {
        return SCHEMA$;
    }

    private static final SpecificData MODEL$ = new SpecificData();

    static {
        MODEL$.addLogicalTypeConversion(new org.apache.avro.Conversions.UUIDConversion());
    }

    private static final BinaryMessageEncoder<StartTranslateEvent> ENCODER = new BinaryMessageEncoder<>(MODEL$,
            SCHEMA$);

    private static final BinaryMessageDecoder<StartTranslateEvent> DECODER = new BinaryMessageDecoder<>(MODEL$,
            SCHEMA$);

    /**
     * Return the BinaryMessageEncoder instance used by this class.
     *
     * @return the message encoder used by this class
     */
    public static BinaryMessageEncoder<StartTranslateEvent> getEncoder() {
        return ENCODER;
    }

    /**
     * Return the BinaryMessageDecoder instance used by this class.
     *
     * @return the message decoder used by this class
     */
    public static BinaryMessageDecoder<StartTranslateEvent> getDecoder() {
        return DECODER;
    }

    /**
     * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
     *
     * @param resolver
     *            a {@link SchemaStore} used to find schemas by fingerprint
     *
     * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
     */
    public static BinaryMessageDecoder<StartTranslateEvent> createDecoder(SchemaStore resolver) {
        return new BinaryMessageDecoder<>(MODEL$, SCHEMA$, resolver);
    }

    /**
     * Serializes this StartTranslateEvent to a ByteBuffer.
     *
     * @return a buffer holding the serialized data for this instance
     *
     * @throws java.io.IOException
     *             if this instance could not be serialized
     */
    public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
        return ENCODER.encode(this);
    }

    /**
     * Deserializes a StartTranslateEvent from a ByteBuffer.
     *
     * @param b
     *            a byte buffer holding serialized data for an instance of this class
     *
     * @return a StartTranslateEvent instance decoded from the given buffer
     *
     * @throws java.io.IOException
     *             if the given bytes could not be deserialized into an instance of this class
     */
    public static StartTranslateEvent fromByteBuffer(java.nio.ByteBuffer b) throws java.io.IOException {
        return DECODER.decode(b);
    }

    private java.lang.CharSequence source;
    private java.lang.CharSequence sourceLanguage;
    private java.lang.CharSequence targetLanguage;
    private com.tomohavvk.translator.kafka.events.EventMeta meta;

    /**
     * Default constructor. Note that this does not initialize fields to their default values from the schema. If that
     * is desired then one should use <code>newBuilder()</code>.
     */
    public StartTranslateEvent() {
    }

    /**
     * All-args constructor.
     *
     * @param source
     *            The new value for source
     * @param sourceLanguage
     *            The new value for sourceLanguage
     * @param targetLanguage
     *            The new value for targetLanguage
     * @param meta
     *            The new value for meta
     */
    public StartTranslateEvent(java.lang.CharSequence source, java.lang.CharSequence sourceLanguage,
            java.lang.CharSequence targetLanguage, com.tomohavvk.translator.kafka.events.EventMeta meta) {
        this.source = source;
        this.sourceLanguage = sourceLanguage;
        this.targetLanguage = targetLanguage;
        this.meta = meta;
    }

    @Override
    public org.apache.avro.specific.SpecificData getSpecificData() {
        return MODEL$;
    }

    @Override
    public org.apache.avro.Schema getSchema() {
        return SCHEMA$;
    }

    // Used by DatumWriter. Applications should not call.
    @Override
    public java.lang.Object get(int field$) {
        switch (field$) {
        case 0:
            return source;
        case 1:
            return sourceLanguage;
        case 2:
            return targetLanguage;
        case 3:
            return meta;
        default:
            throw new IndexOutOfBoundsException("Invalid index: " + field$);
        }
    }

    // Used by DatumReader. Applications should not call.
    @Override
    @SuppressWarnings(value = "unchecked")
    public void put(int field$, java.lang.Object value$) {
        switch (field$) {
        case 0:
            source = (java.lang.CharSequence) value$;
            break;
        case 1:
            sourceLanguage = (java.lang.CharSequence) value$;
            break;
        case 2:
            targetLanguage = (java.lang.CharSequence) value$;
            break;
        case 3:
            meta = (com.tomohavvk.translator.kafka.events.EventMeta) value$;
            break;
        default:
            throw new IndexOutOfBoundsException("Invalid index: " + field$);
        }
    }

    /**
     * Gets the value of the 'source' field.
     *
     * @return The value of the 'source' field.
     */
    public java.lang.CharSequence getSource() {
        return source;
    }

    /**
     * Sets the value of the 'source' field.
     *
     * @param value
     *            the value to set.
     */
    public void setSource(java.lang.CharSequence value) {
        this.source = value;
    }

    /**
     * Gets the value of the 'sourceLanguage' field.
     *
     * @return The value of the 'sourceLanguage' field.
     */
    public java.lang.CharSequence getSourceLanguage() {
        return sourceLanguage;
    }

    /**
     * Sets the value of the 'sourceLanguage' field.
     *
     * @param value
     *            the value to set.
     */
    public void setSourceLanguage(java.lang.CharSequence value) {
        this.sourceLanguage = value;
    }

    /**
     * Gets the value of the 'targetLanguage' field.
     *
     * @return The value of the 'targetLanguage' field.
     */
    public java.lang.CharSequence getTargetLanguage() {
        return targetLanguage;
    }

    /**
     * Sets the value of the 'targetLanguage' field.
     *
     * @param value
     *            the value to set.
     */
    public void setTargetLanguage(java.lang.CharSequence value) {
        this.targetLanguage = value;
    }

    /**
     * Gets the value of the 'meta' field.
     *
     * @return The value of the 'meta' field.
     */
    public com.tomohavvk.translator.kafka.events.EventMeta getMeta() {
        return meta;
    }

    /**
     * Sets the value of the 'meta' field.
     *
     * @param value
     *            the value to set.
     */
    public void setMeta(com.tomohavvk.translator.kafka.events.EventMeta value) {
        this.meta = value;
    }

    /**
     * Creates a new StartTranslateEvent RecordBuilder.
     *
     * @return A new StartTranslateEvent RecordBuilder
     */
    public static com.tomohavvk.translator.kafka.events.StartTranslateEvent.Builder newBuilder() {
        return new com.tomohavvk.translator.kafka.events.StartTranslateEvent.Builder();
    }

    /**
     * Creates a new StartTranslateEvent RecordBuilder by copying an existing Builder.
     *
     * @param other
     *            The existing builder to copy.
     *
     * @return A new StartTranslateEvent RecordBuilder
     */
    public static com.tomohavvk.translator.kafka.events.StartTranslateEvent.Builder newBuilder(
            com.tomohavvk.translator.kafka.events.StartTranslateEvent.Builder other) {
        if (other == null) {
            return new com.tomohavvk.translator.kafka.events.StartTranslateEvent.Builder();
        } else {
            return new com.tomohavvk.translator.kafka.events.StartTranslateEvent.Builder(other);
        }
    }

    /**
     * Creates a new StartTranslateEvent RecordBuilder by copying an existing StartTranslateEvent instance.
     *
     * @param other
     *            The existing instance to copy.
     *
     * @return A new StartTranslateEvent RecordBuilder
     */
    public static com.tomohavvk.translator.kafka.events.StartTranslateEvent.Builder newBuilder(
            com.tomohavvk.translator.kafka.events.StartTranslateEvent other) {
        if (other == null) {
            return new com.tomohavvk.translator.kafka.events.StartTranslateEvent.Builder();
        } else {
            return new com.tomohavvk.translator.kafka.events.StartTranslateEvent.Builder(other);
        }
    }

    /**
     * RecordBuilder for StartTranslateEvent instances.
     */
    @org.apache.avro.specific.AvroGenerated
    public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<StartTranslateEvent>
            implements org.apache.avro.data.RecordBuilder<StartTranslateEvent> {

        private java.lang.CharSequence source;
        private java.lang.CharSequence sourceLanguage;
        private java.lang.CharSequence targetLanguage;
        private com.tomohavvk.translator.kafka.events.EventMeta meta;
        private com.tomohavvk.translator.kafka.events.EventMeta.Builder metaBuilder;

        /**
         * Creates a new Builder
         */
        private Builder() {
            super(SCHEMA$, MODEL$);
        }

        /**
         * Creates a Builder by copying an existing Builder.
         *
         * @param other
         *            The existing Builder to copy.
         */
        private Builder(com.tomohavvk.translator.kafka.events.StartTranslateEvent.Builder other) {
            super(other);
            if (isValidValue(fields()[0], other.source)) {
                this.source = data().deepCopy(fields()[0].schema(), other.source);
                fieldSetFlags()[0] = other.fieldSetFlags()[0];
            }
            if (isValidValue(fields()[1], other.sourceLanguage)) {
                this.sourceLanguage = data().deepCopy(fields()[1].schema(), other.sourceLanguage);
                fieldSetFlags()[1] = other.fieldSetFlags()[1];
            }
            if (isValidValue(fields()[2], other.targetLanguage)) {
                this.targetLanguage = data().deepCopy(fields()[2].schema(), other.targetLanguage);
                fieldSetFlags()[2] = other.fieldSetFlags()[2];
            }
            if (isValidValue(fields()[3], other.meta)) {
                this.meta = data().deepCopy(fields()[3].schema(), other.meta);
                fieldSetFlags()[3] = other.fieldSetFlags()[3];
            }
            if (other.hasMetaBuilder()) {
                this.metaBuilder = com.tomohavvk.translator.kafka.events.EventMeta.newBuilder(other.getMetaBuilder());
            }
        }

        /**
         * Creates a Builder by copying an existing StartTranslateEvent instance
         *
         * @param other
         *            The existing instance to copy.
         */
        private Builder(com.tomohavvk.translator.kafka.events.StartTranslateEvent other) {
            super(SCHEMA$, MODEL$);
            if (isValidValue(fields()[0], other.source)) {
                this.source = data().deepCopy(fields()[0].schema(), other.source);
                fieldSetFlags()[0] = true;
            }
            if (isValidValue(fields()[1], other.sourceLanguage)) {
                this.sourceLanguage = data().deepCopy(fields()[1].schema(), other.sourceLanguage);
                fieldSetFlags()[1] = true;
            }
            if (isValidValue(fields()[2], other.targetLanguage)) {
                this.targetLanguage = data().deepCopy(fields()[2].schema(), other.targetLanguage);
                fieldSetFlags()[2] = true;
            }
            if (isValidValue(fields()[3], other.meta)) {
                this.meta = data().deepCopy(fields()[3].schema(), other.meta);
                fieldSetFlags()[3] = true;
            }
            this.metaBuilder = null;
        }

        /**
         * Gets the value of the 'source' field.
         *
         * @return The value.
         */
        public java.lang.CharSequence getSource() {
            return source;
        }

        /**
         * Sets the value of the 'source' field.
         *
         * @param value
         *            The value of 'source'.
         *
         * @return This builder.
         */
        public com.tomohavvk.translator.kafka.events.StartTranslateEvent.Builder setSource(
                java.lang.CharSequence value) {
            validate(fields()[0], value);
            this.source = value;
            fieldSetFlags()[0] = true;
            return this;
        }

        /**
         * Checks whether the 'source' field has been set.
         *
         * @return True if the 'source' field has been set, false otherwise.
         */
        public boolean hasSource() {
            return fieldSetFlags()[0];
        }

        /**
         * Clears the value of the 'source' field.
         *
         * @return This builder.
         */
        public com.tomohavvk.translator.kafka.events.StartTranslateEvent.Builder clearSource() {
            source = null;
            fieldSetFlags()[0] = false;
            return this;
        }

        /**
         * Gets the value of the 'sourceLanguage' field.
         *
         * @return The value.
         */
        public java.lang.CharSequence getSourceLanguage() {
            return sourceLanguage;
        }

        /**
         * Sets the value of the 'sourceLanguage' field.
         *
         * @param value
         *            The value of 'sourceLanguage'.
         *
         * @return This builder.
         */
        public com.tomohavvk.translator.kafka.events.StartTranslateEvent.Builder setSourceLanguage(
                java.lang.CharSequence value) {
            validate(fields()[1], value);
            this.sourceLanguage = value;
            fieldSetFlags()[1] = true;
            return this;
        }

        /**
         * Checks whether the 'sourceLanguage' field has been set.
         *
         * @return True if the 'sourceLanguage' field has been set, false otherwise.
         */
        public boolean hasSourceLanguage() {
            return fieldSetFlags()[1];
        }

        /**
         * Clears the value of the 'sourceLanguage' field.
         *
         * @return This builder.
         */
        public com.tomohavvk.translator.kafka.events.StartTranslateEvent.Builder clearSourceLanguage() {
            sourceLanguage = null;
            fieldSetFlags()[1] = false;
            return this;
        }

        /**
         * Gets the value of the 'targetLanguage' field.
         *
         * @return The value.
         */
        public java.lang.CharSequence getTargetLanguage() {
            return targetLanguage;
        }

        /**
         * Sets the value of the 'targetLanguage' field.
         *
         * @param value
         *            The value of 'targetLanguage'.
         *
         * @return This builder.
         */
        public com.tomohavvk.translator.kafka.events.StartTranslateEvent.Builder setTargetLanguage(
                java.lang.CharSequence value) {
            validate(fields()[2], value);
            this.targetLanguage = value;
            fieldSetFlags()[2] = true;
            return this;
        }

        /**
         * Checks whether the 'targetLanguage' field has been set.
         *
         * @return True if the 'targetLanguage' field has been set, false otherwise.
         */
        public boolean hasTargetLanguage() {
            return fieldSetFlags()[2];
        }

        /**
         * Clears the value of the 'targetLanguage' field.
         *
         * @return This builder.
         */
        public com.tomohavvk.translator.kafka.events.StartTranslateEvent.Builder clearTargetLanguage() {
            targetLanguage = null;
            fieldSetFlags()[2] = false;
            return this;
        }

        /**
         * Gets the value of the 'meta' field.
         *
         * @return The value.
         */
        public com.tomohavvk.translator.kafka.events.EventMeta getMeta() {
            return meta;
        }

        /**
         * Sets the value of the 'meta' field.
         *
         * @param value
         *            The value of 'meta'.
         *
         * @return This builder.
         */
        public com.tomohavvk.translator.kafka.events.StartTranslateEvent.Builder setMeta(
                com.tomohavvk.translator.kafka.events.EventMeta value) {
            validate(fields()[3], value);
            this.metaBuilder = null;
            this.meta = value;
            fieldSetFlags()[3] = true;
            return this;
        }

        /**
         * Checks whether the 'meta' field has been set.
         *
         * @return True if the 'meta' field has been set, false otherwise.
         */
        public boolean hasMeta() {
            return fieldSetFlags()[3];
        }

        /**
         * Gets the Builder instance for the 'meta' field and creates one if it doesn't exist yet.
         *
         * @return This builder.
         */
        public com.tomohavvk.translator.kafka.events.EventMeta.Builder getMetaBuilder() {
            if (metaBuilder == null) {
                if (hasMeta()) {
                    setMetaBuilder(com.tomohavvk.translator.kafka.events.EventMeta.newBuilder(meta));
                } else {
                    setMetaBuilder(com.tomohavvk.translator.kafka.events.EventMeta.newBuilder());
                }
            }
            return metaBuilder;
        }

        /**
         * Sets the Builder instance for the 'meta' field
         *
         * @param value
         *            The builder instance that must be set.
         *
         * @return This builder.
         */

        public com.tomohavvk.translator.kafka.events.StartTranslateEvent.Builder setMetaBuilder(
                com.tomohavvk.translator.kafka.events.EventMeta.Builder value) {
            clearMeta();
            metaBuilder = value;
            return this;
        }

        /**
         * Checks whether the 'meta' field has an active Builder instance
         *
         * @return True if the 'meta' field has an active Builder instance
         */
        public boolean hasMetaBuilder() {
            return metaBuilder != null;
        }

        /**
         * Clears the value of the 'meta' field.
         *
         * @return This builder.
         */
        public com.tomohavvk.translator.kafka.events.StartTranslateEvent.Builder clearMeta() {
            meta = null;
            metaBuilder = null;
            fieldSetFlags()[3] = false;
            return this;
        }

        @Override
        @SuppressWarnings("unchecked")
        public StartTranslateEvent build() {
            try {
                StartTranslateEvent record = new StartTranslateEvent();
                record.source = fieldSetFlags()[0] ? this.source : (java.lang.CharSequence) defaultValue(fields()[0]);
                record.sourceLanguage = fieldSetFlags()[1] ? this.sourceLanguage
                        : (java.lang.CharSequence) defaultValue(fields()[1]);
                record.targetLanguage = fieldSetFlags()[2] ? this.targetLanguage
                        : (java.lang.CharSequence) defaultValue(fields()[2]);
                if (metaBuilder != null) {
                    try {
                        record.meta = this.metaBuilder.build();
                    } catch (org.apache.avro.AvroMissingFieldException e) {
                        e.addParentField(record.getSchema().getField("meta"));
                        throw e;
                    }
                } else {
                    record.meta = fieldSetFlags()[3] ? this.meta
                            : (com.tomohavvk.translator.kafka.events.EventMeta) defaultValue(fields()[3]);
                }
                return record;
            } catch (org.apache.avro.AvroMissingFieldException e) {
                throw e;
            } catch (java.lang.Exception e) {
                throw new org.apache.avro.AvroRuntimeException(e);
            }
        }
    }

    @SuppressWarnings("unchecked")
    private static final org.apache.avro.io.DatumWriter<StartTranslateEvent> WRITER$ = (org.apache.avro.io.DatumWriter<StartTranslateEvent>) MODEL$
            .createDatumWriter(SCHEMA$);

    @Override
    public void writeExternal(java.io.ObjectOutput out) throws java.io.IOException {
        WRITER$.write(this, SpecificData.getEncoder(out));
    }

    @SuppressWarnings("unchecked")
    private static final org.apache.avro.io.DatumReader<StartTranslateEvent> READER$ = (org.apache.avro.io.DatumReader<StartTranslateEvent>) MODEL$
            .createDatumReader(SCHEMA$);

    @Override
    public void readExternal(java.io.ObjectInput in) throws java.io.IOException {
        READER$.read(this, SpecificData.getDecoder(in));
    }

}
