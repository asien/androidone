package com.sd.one.utils.db.gen;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

import com.sd.one.utils.db.entity.Product;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "PRODUCT".
*/
public class ProductDao extends AbstractDao<Product, Long> {

    public static final String TABLENAME = "PRODUCT";

    /**
     * Properties of entity Product.<br/>
     * Can be used for QueryBuilder and for referencing column names.
    */
    public static class Properties {
        public final static Property ProductId = new Property(0, Long.class, "productId", true, "_id");
        public final static Property PorductName = new Property(1, String.class, "porductName", false, "PORDUCT_NAME");
        public final static Property BasePrice = new Property(2, String.class, "basePrice", false, "BASE_PRICE");
        public final static Property Image = new Property(3, String.class, "image", false, "IMAGE");
        public final static Property Desc = new Property(4, String.class, "desc", false, "DESC");
        public final static Property CreteTime = new Property(5, String.class, "creteTime", false, "CRETE_TIME");
    };


    public ProductDao(DaoConfig config) {
        super(config);
    }
    
    public ProductDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"PRODUCT\" (" + //
                "\"_id\" INTEGER PRIMARY KEY AUTOINCREMENT ," + // 0: productId
                "\"PORDUCT_NAME\" TEXT," + // 1: porductName
                "\"BASE_PRICE\" TEXT," + // 2: basePrice
                "\"IMAGE\" TEXT," + // 3: image
                "\"DESC\" TEXT," + // 4: desc
                "\"CRETE_TIME\" TEXT);"); // 5: creteTime
        // Add Indexes
        db.execSQL("CREATE INDEX " + constraint + "IDX_PRODUCT_PORDUCT_NAME ON PRODUCT" +
                " (\"PORDUCT_NAME\" ASC);");
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"PRODUCT\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, Product entity) {
        stmt.clearBindings();
 
        Long productId = entity.getProductId();
        if (productId != null) {
            stmt.bindLong(1, productId);
        }
 
        String porductName = entity.getPorductName();
        if (porductName != null) {
            stmt.bindString(2, porductName);
        }
 
        String basePrice = entity.getBasePrice();
        if (basePrice != null) {
            stmt.bindString(3, basePrice);
        }
 
        String image = entity.getImage();
        if (image != null) {
            stmt.bindString(4, image);
        }
 
        String desc = entity.getDesc();
        if (desc != null) {
            stmt.bindString(5, desc);
        }
 
        String creteTime = entity.getCreteTime();
        if (creteTime != null) {
            stmt.bindString(6, creteTime);
        }
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, Product entity) {
        stmt.clearBindings();
 
        Long productId = entity.getProductId();
        if (productId != null) {
            stmt.bindLong(1, productId);
        }
 
        String porductName = entity.getPorductName();
        if (porductName != null) {
            stmt.bindString(2, porductName);
        }
 
        String basePrice = entity.getBasePrice();
        if (basePrice != null) {
            stmt.bindString(3, basePrice);
        }
 
        String image = entity.getImage();
        if (image != null) {
            stmt.bindString(4, image);
        }
 
        String desc = entity.getDesc();
        if (desc != null) {
            stmt.bindString(5, desc);
        }
 
        String creteTime = entity.getCreteTime();
        if (creteTime != null) {
            stmt.bindString(6, creteTime);
        }
    }

    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    @Override
    public Product readEntity(Cursor cursor, int offset) {
        Product entity = new Product( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // productId
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // porductName
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // basePrice
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // image
            cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4), // desc
            cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5) // creteTime
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, Product entity, int offset) {
        entity.setProductId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setPorductName(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setBasePrice(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setImage(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setDesc(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
        entity.setCreteTime(cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5));
     }
    
    @Override
    protected final Long updateKeyAfterInsert(Product entity, long rowId) {
        entity.setProductId(rowId);
        return rowId;
    }
    
    @Override
    public Long getKey(Product entity) {
        if(entity != null) {
            return entity.getProductId();
        } else {
            return null;
        }
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}
