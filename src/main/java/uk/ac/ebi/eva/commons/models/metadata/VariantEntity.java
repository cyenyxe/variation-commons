package uk.ac.ebi.eva.commons.models.metadata;

import org.opencb.biodata.models.variant.Variant;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Subclass of org.opencb.biodata.models.variant.Variant.
 * Purpose is to allow the specifying of collection name with @Document annotation.
 */
@Document(collection = "variants_1_2")
public class VariantEntity extends Variant {

    public VariantEntity(Variant variant) {
        setIds(variant.getIds());
        setChromosome(variant.getChromosome());
        setStart(variant.getStart());
        setEnd(variant.getEnd());
        setLength(variant.getLength());
        setAlternate(variant.getAlternate());
        setReference(variant.getReference());
        setType(variant.getType());
        setAnnotation(variant.getAnnotation());
        setSourceEntries(variant.getSourceEntries());
    }

    public VariantEntity() {
    }

    public VariantEntity(String chromosome, int start, int end, String reference, String alternate) {
        super(chromosome, start, end, reference, alternate);
    }
}