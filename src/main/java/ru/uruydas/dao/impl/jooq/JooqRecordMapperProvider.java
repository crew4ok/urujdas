package ru.uruydas.dao.impl.jooq;

import org.jooq.Record;
import org.jooq.RecordMapper;
import org.jooq.RecordMapperProvider;
import org.jooq.RecordType;
import ru.uruydas.dao.impl.jooq.mappers.CommentRecordMapper;
import ru.uruydas.dao.impl.jooq.mappers.ImageRecordMapper;
import ru.uruydas.dao.impl.jooq.mappers.NewsCategoryRecordMapper;
import ru.uruydas.dao.impl.jooq.mappers.NewsRecordMapper;
import ru.uruydas.dao.impl.jooq.mappers.UserFilterRecordMapper;
import ru.uruydas.dao.impl.jooq.mappers.UserRecordMapper;
import ru.uruydas.model.comments.Comment;
import ru.uruydas.model.images.Image;
import ru.uruydas.model.news.News;
import ru.uruydas.model.news.NewsCategory;
import ru.uruydas.model.users.User;
import ru.uruydas.model.users.UserFilter;
import ru.uruydas.dao.impl.jooq.mappers.AdsCategoryRecordMapper;
import ru.uruydas.dao.impl.jooq.mappers.AdsRecordMapper;
import ru.uruydas.model.ads.Ads;
import ru.uruydas.model.ads.AdsCategory;

public class JooqRecordMapperProvider implements RecordMapperProvider {

    private final UserRecordMapper userRecordMapper;
    private final UserFilterRecordMapper userFilterRecordMapper;
    private final NewsRecordMapper newsRecordMapper;
    private final NewsCategoryRecordMapper newsCategoryRecordMapper;
    private final CommentRecordMapper commentRecordMapper;
    private final ImageRecordMapper imageRecordMapper;
    private final AdsRecordMapper adsRecordMapper;
    private final AdsCategoryRecordMapper adsCategoryRecordMapper;

    public JooqRecordMapperProvider(UserRecordMapper userRecordMapper,
                                    UserFilterRecordMapper userFilterRecordMapper,
                                    NewsRecordMapper newsRecordMapper,
                                    NewsCategoryRecordMapper newsCategoryRecordMapper,
                                    CommentRecordMapper commentRecordMapper,
                                    ImageRecordMapper imageRecordMapper,
                                    AdsRecordMapper adsRecordMapper,
                                    AdsCategoryRecordMapper adsCategoryRecordMapper) {

        this.userRecordMapper = userRecordMapper;
        this.userFilterRecordMapper = userFilterRecordMapper;
        this.newsRecordMapper = newsRecordMapper;
        this.newsCategoryRecordMapper = newsCategoryRecordMapper;
        this.commentRecordMapper = commentRecordMapper;
        this.imageRecordMapper = imageRecordMapper;
        this.adsRecordMapper = adsRecordMapper;
        this.adsCategoryRecordMapper = adsCategoryRecordMapper;
    }

    @SuppressWarnings("unchecked")
    @Override
    public <R extends Record, E> RecordMapper<R, E> provide(RecordType<R> recordType, Class<? extends E> type) {
        if (User.class.equals(type)) {
            return (RecordMapper<R, E>) userRecordMapper;
        }

        if (UserFilter.class.equals(type)) {
            return (RecordMapper<R, E>) userFilterRecordMapper;
        }

        if (News.class.equals(type)) {
            return (RecordMapper<R, E>) newsRecordMapper;
        }

        if (NewsCategory.class.equals(type)) {
            return (RecordMapper<R, E>) newsCategoryRecordMapper;
        }

        if (Comment.class.equals(type)) {
            return (RecordMapper<R, E>) commentRecordMapper;
        }

        if (Image.class.equals(type)) {
            return (RecordMapper<R, E>) imageRecordMapper;
        }

        if (Ads.class.equals(type)) {
            return (RecordMapper<R, E>) adsRecordMapper;
        }

        if (AdsCategory.class.equals(type)) {
            return (RecordMapper<R, E>) adsCategoryRecordMapper;
        }

        throw new RuntimeException("Mapper for type " + type.getName() + " is not found");
    }
}
